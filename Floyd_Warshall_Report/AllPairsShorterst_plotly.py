import numpy as np
import random
import time
import plotly.graph_objects as go

def generate_random_graph(node_count):
    adjacency_matrix = np.zeros((node_count, node_count))
    for i in range(node_count):
        for j in range(node_count):
            if i != j:
                adjacency_matrix[i][j] = random.randint(4, 30)
    return adjacency_matrix

def floyd_warshall(node_count):
    adjacency_matrix = generate_random_graph(node_count)
    path = np.zeros((node_count, node_count), dtype=int)

    for k in range(node_count):
        for i in range(node_count):
            for j in range(node_count):
                if adjacency_matrix[i][j] > adjacency_matrix[i][k] + adjacency_matrix[k][j]:
                    adjacency_matrix[i][j] = adjacency_matrix[i][k] + adjacency_matrix[k][j]
                    path[i][j] = k + 1

    return adjacency_matrix, path

def reconstruct_path(start, end, path):
    if path[start][end] == 0:
        return [start, end]
    intermediate = path[start][end] - 1
    return reconstruct_path(start, intermediate, path) + reconstruct_path(intermediate, end, path)[1:]

def calculate_path_length(path, adjacency_matrix):
    length = 0
    for i in range(len(path) - 1):
        length += adjacency_matrix[path[i]][path[i + 1]]
    return length

node_counts = [50, 100, 150, 200, 250]
average_path_lengths = []
execution_times = []

for node_count in node_counts:
    start_time = time.time()
    adjacency_matrix, path = floyd_warshall(node_count)
    average_path_length = 0

    for i in range(node_count):
        for j in range(node_count):
            if i != j:
                shortest_path = reconstruct_path(i, j, path)
                shortest_path_length = calculate_path_length(shortest_path, adjacency_matrix)
                average_path_length += shortest_path_length

    average_path_length /= (node_count * (node_count - 1))
    average_path_lengths.append(average_path_length)
    end_time = time.time()
    elapsed_time = end_time - start_time
    execution_times.append(elapsed_time)

    # 경로 그래프 생성
    edge_trace = go.Scatter(
        x=[],
        y=[],
        line=dict(width=0.5, color='gray'),
        hoverinfo='none',
        mode='lines'
    )

    node_trace = go.Scatter(
        x=[],
        y=[],
        text=[],
        mode='markers+text',
        hoverinfo='text',
        marker=dict(
            showscale=False,
            colorscale='YlGnBu',
            reversescale=True,
            color=[],
            size=10,
            line_width=0.5
        ),
        textposition='top center'
    )

    for node in range(node_count):
        node_trace['x'] += tuple([random.random()])
        node_trace['y'] += tuple([random.random()])
        node_trace['text'] += tuple([f'노드 {node}'])
        node_trace['marker']['color'] += tuple([adjacency_matrix[node][node]])

    # 경로 그래프 시각화
    for i in range(node_count):
        for j in range(i + 1, node_count):
            path_nodes = reconstruct_path(i, j, path)
            for k in range(len(path_nodes) - 1):
                x0, y0 = random.random(), random.random()
                x1, y1 = random.random(), random.random()
                edge_trace['x'] += tuple([x0, x1, None])
                edge_trace['y'] += tuple([y0, y1, None])

                # 노드 쌍 간의 경로 표시
                edge_text = f'{i} → {path_nodes[k] + 1} → {path_nodes[k + 1] + 1} → {j}'
                if edge_trace.text is None:
                    edge_trace.text = tuple([edge_text])
                else:
                    edge_trace.text += tuple([edge_text])

    # 그래프 레이아웃 설정
    layout = go.Layout(
        title=f"노드 수에 따른 최단 경로: {node_count}",
        showlegend=False,
        hovermode='closest',
        margin=dict(b=20, l=5, r=5, t=40),
        xaxis=dict(showgrid=False, zeroline=False, showticklabels=False),
        yaxis=dict(showgrid=False, zeroline=False, showticklabels=False)
    )

    # 그래프 생성 및 표시
    fig = go.Figure(data=[edge_trace, node_trace], layout=layout)
    fig.show()
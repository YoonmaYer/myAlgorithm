import numpy as np
import random
import time
import matplotlib.pyplot as plt
import networkx as nx
plt.rcParams['font.family'] = 'Malgun Gothic'


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
    G = nx.Graph()
    for node in range(node_count):
        G.add_node(node)
    for i in range(node_count):
        for j in range(node_count):
            if i != j:
                path_nodes = reconstruct_path(i, j, path)
                for k in range(len(path_nodes) - 1):
                    G.add_edge(path_nodes[k], path_nodes[k + 1])

    # 경로 그래프 시각화
    plt.figure()
    pos = nx.spring_layout(G)
    plt.title(f"노드 수에 따른 최단 경로: {node_count}")
    plt.text(0.5, -0.1, f"노드 수: {node_count}", horizontalalignment='center', verticalalignment='center',
             transform=plt.gca().transAxes)
    nx.draw(G, pos, with_labels=True, node_color='lightblue', edge_color='gray', width=2)




# 결과 그래프 그리기
plt.figure()
plt.plot(node_counts, average_path_lengths, marker='o', label='평균 최단 거리')
plt.plot(node_counts, execution_times, marker='o', label='수행 시간')
plt.xlabel('노드 수')
plt.ylabel('값')
plt.title('평균 최단 거리와 수행 시간')
plt.legend()
plt.show()
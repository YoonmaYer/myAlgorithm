import numpy as np
import random
import time

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
calculation_times = []

for node_count in node_counts:
    print(f"노드 개수: {node_count}")
    start_time = time.time()
    adjacency_matrix, path = floyd_warshall(node_count)
    average_path_length = 0

    for i in range(node_count):
        for j in range(node_count):
            if i != j:
                shortest_path = reconstruct_path(i, j, path)
                shortest_path_length = calculate_path_length(shortest_path, adjacency_matrix)
                average_path_length += shortest_path_length
                print(f"{i}에서 {j}까지의 최단 경로: {shortest_path}")
                print(f"최단 경로 길이: {shortest_path_length}")

    average_path_length /= (node_count * (node_count - 1))
    average_path_lengths.append(average_path_length)
    end_time = time.time()
    elapsed_time = end_time - start_time
    calculation_times.append(elapsed_time)
    print(f"평균 최단 경로 길이: {average_path_length}")
    print(f"계산 시간: {elapsed_time}초")
    print("---")

print("요약")
for i, node_count in enumerate(node_counts):
    print(f"노드 개수: {node_count}")
    print(f"평균 최단 경로 길이: {average_path_lengths[i]}")
    print(f"계산 시간: {calculation_times[i]}초")
    print("---")
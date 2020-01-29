from heapq import heappush, heappop

def dijkstra(v, k, g):
    dist = [INF] * v
    dist[k - 1] = 0
    q = []
    heapq.heappush(q, [0, k-1])

    while q:
        cost, pos = heapq.heappop(q)

        for p, c in g[pos]:
            c += cost
            if c < dist[p]:
                dist[p] = c
                heapq.heappush(q, [c, p])
    return dist


Graph = [[] for _ in range(V)]

N = int(input())
M = int(input())
for _ in range(M):
    u, v, w = map(int, input().split())
    Graph[u-1].append([v-1, w])
Start,End = list(map(int,input().split()))

Path = dijkstra(N,Start,Graph)
print(Path[End-1])

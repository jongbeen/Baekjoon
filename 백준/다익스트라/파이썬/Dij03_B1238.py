from heapq import heappush, heappop

INF = 1e9

def dijkstra(V,S,graph):
    dist =  [INF] *V 
    dist[S-1] = 0
    queue = []
    heappush(queue, [0,S-1])
    
    while queue:
        cost,pos = heappop(queue)
        for p,c in graph[pos]:
            c += cost
            if c < dist[p]:
                dist[p] = c
                heappush(queue,[c,p])
    return dist

N,M,X = list(map(int,input().split()))
Graph = [[] for _ in range(N)]
Ans = []
viliage,rev_viliage = list(),list()
for _ in range(M):
    u,v,w = list(map(int,input().split()))
    Graph[u-1].append([v-1,w])
    

for i in range(1,N+1):
    temp = dijkstra(N,i,Graph)
    num = temp[X-1]
    viliage.append(num)
rev_vilage = dijkstra(N,X,Graph)    

for i in range(len(viliage)):
    Ans.append(viliage[i]+rev_vilage[i])
Ans.sort()
print(Ans[-1])

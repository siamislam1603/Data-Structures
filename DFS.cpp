#include<stdio.h>
#define Size 100
#define white 1
#define black 2
#define gray 3

int color[Size];
int p[Size];
int adj[Size][Size];
void visit_dfs(int u,int vertex){
        color[u]=gray;
        for(int j=0;j<vertex;j++)
        {
            if(adj[u][j]==1){
                int v=j;
                if(color[v]==white){
                    p[v]=u;
                    visit_dfs(v,vertex);
                }
            }
        }
        color[u]=black;
        printf("%d ",u);
}
void dfs(int vertex)
{
    for(int j=0;j<vertex;j++)
    {
        color[j]=white;
    }
    printf("\DFS is: ");
    for(int i=0;i<vertex;i++)
    {
        if(color[i]==white){
            visit_dfs(i,vertex);
        }
    }
}

int main(void)
{
    int vertex,edge,start;
    printf("Enter Num of Vertex and Edge:");
    scanf("%d%d",&vertex,&edge);
    printf("Enter adjacency:\n");
    for(int i=0;i<edge;i++){
        int node1,node2;
        scanf("%d %d",&node1,&node2);
        adj[node1][node2]=1;
        adj[node2][node1]=1;
    }
    dfs(vertex);
}


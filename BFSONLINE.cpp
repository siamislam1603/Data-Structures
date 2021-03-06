#include<bits/stdc++.h>
using namespace std;

#define Size 100
#define white 0
#define gray 1
#define black 2

int adj[Size][Size],colour[Size],p[Size],d[Size],Queue[Size],Front=0,rear=Size-1,qSize=0;
void bfs(int adj[][Size],int v,int sNode);
void pop();
void push(int node);
void printpath(int sNode,int eNode);

int main(){
    int v,e,node1,node2,startingNode;
    printf("No of vertex:");
    scanf("%d",&v);
    printf("No of edge:");
    scanf("%d",&e);
    printf("Connected Nodes:\n");
    for(int i=0;i<e;i++){
        scanf("%d %d",&node1,&node2);
        adj[node1][node2]=1;
        adj[node2][node1]=1;
    }
    printf("\nEnter Starting node:");
    scanf("%d",&startingNode);
    bfs(adj,v,startingNode);
    printpath(2,1);
    return 0;
}
void bfs(int adj[][Size],int v,int sNode){
    for(int i=0;i<v;i++){
        if(i!=sNode){
            colour[i]=white;
            d[i]=INT_MIN;
            p[i]=-1;
        }
        else{
            colour[sNode]=gray;
            d[sNode]=0;
            p[sNode]=-1;
        }
    }
    push(sNode);
    printf("\nBFS is:");
    while(qSize!=0){
        int u=Queue[Front];
        printf("%d  ",u);
        pop();
        for(int i=0;i<v;i++){
            if(adj[u][i]!=0){
                int v=i;
                if(colour[v]==white){
                    colour[v]=gray;
                    d[v]=d[u]+1;
                    p[v]=u;
                    push(v);
                }
            }
        }
        colour[u]=black;
    }
}
void pop(){
    Front=(Front+1)%Size;
    qSize--;
}
void push(int node){
    rear=(rear+1)%Size;
    Queue[rear]=node;
    qSize++;
}

void printpath(int sNode,int eNode){
    char path[Size];
    int par=p[eNode];
    int i=0;
    path[i++]=eNode+'0';
    path[i++]=' ';
    while(par!=-1){
        path[i++]=par+'0';
        path[i++]=' ';
        par=p[par];
    }
    path[i]='\0';
    strrev(path);
    cout<<"The Path is: "<<path<<endl;
}

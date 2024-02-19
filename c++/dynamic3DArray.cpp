#include<iostream>
using namespace std;
int main(){
    int n,m;
    cin>>n>>m;
    int ***a=new int**[n];
    for(int i=0;i<n;i++){
        a[i]=new int*[m];
        for(int j=0;j<m;j++){
            a[i][j]=new int;
            cin>>*a[i][j];
        }
    }
    int sum=0;
    cout<<endl;
    cout<<"Array :"<<endl;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            sum+=*a[i][j];
            cout<<*a[i][j]<<" ";
        }
        cout<<endl;
    }
    cout<<"Sum : "<<sum<<endl;
    cout<<endl;
    delete [] a;
    return 0;
}
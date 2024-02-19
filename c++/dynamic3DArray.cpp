#include<iostream>
using namespace std;
int main(){
    int n,m,o;
    cin>>n>>m>>o;
    int ***a=new int**[n];
    for(int i=0;i<n;i++){
        a[i]=new int*[m];
        for(int j=0;j<m;j++){
            a[i][j]=new int[o];
            for(int k=0;k<o;k++){
                cin>>a[i][j][k];
            }
        }
    }
    int sum=0;
    cout<<endl;
    cout<<"Array :"<<endl;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            for(int k=0;k<o;k++){
                sum+=a[i][j][k];
                cout<<a[i][j][k]<<" ";
            }
            cout<<endl;
        }
        cout<<endl;
    }
    cout<<"Sum : "<<sum<<endl;
    cout<<endl;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            delete[] a[i][j];
        }
        delete[] a[i];
    }
    delete [] a;
    return 0;
}
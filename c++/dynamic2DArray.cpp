#include<iostream>
using namespace std;
int main(){
    int n,m;
    cin>>n>>m;
    int **a=new int*[n];
    // int *arr=new int[n*m];
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         cin>>*(arr+i*m+j);
    //     }
    //     *a[i]=*(arr+i*m);
    // }
    for(int i=0;i<n;i++){
        a[i]=new int[m];
        for(int j=0;j<m;j++){
            cin>>a[i][j];
        }
    }
    int sum=0;
    cout<<endl;
    // cout<<"Array:"<<endl;
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         sum+=*(arr+i*m+j);
    //         cout<<*(arr+i*m+j)<<" ";
    //     }
    //     cout<<endl;
    // }
    cout<<"Sum : "<<sum<<endl;
    cout<<"Array of pointers:"<<endl;
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
    cout<<endl;
    cout<<endl;
    //cout<<arr<<endl;
    delete [] a;
    //delete [] arr;
    return 0;
}
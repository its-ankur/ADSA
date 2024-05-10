#include<iostream>
#include<fstream>
#include<string>
using namespace std;
int main(){
    fstream file;
    string s;
    s=" hello world";
    file.open("file1.txt",ios::app);
    // getline(file,s,'\n');
    // cout<<s<<endl;
    file<<s;
    cout<<s;
    file.close();
    return 0;
}
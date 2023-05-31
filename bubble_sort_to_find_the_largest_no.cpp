//Write a method that will return the Nth largest number from a data of M numbers in the most efficient way using either selection or bubble sort.

#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"enter the n ";
    cin>>n;
    int arr[n];
    int swapped;
    for(int i=0;i<n;i++){
        cout<<"enter the element is ";
        cin>>arr[i];
        
    }
    for(int i=0;i<n-1;i++){
        swapped=false;
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                swap(arr[j],arr[j+1]);
                swapped=true;
            }
        }
        if(swapped==false){
            break;
        }
        for(int i=0;i<n;i++){
            cout<<arr[i]<<", ";
        }
        cout<<endl;
        cout<<"The largest number is "<<arr[n-1];
    }
    
}

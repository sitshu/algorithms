/* Rotate an array of n elements to the right by k steps*
Space = O(1)
Time Complexity = O(n)

*/

#include<iostream>
#include<stdlib.h>

using namespace std;

void reverse_array(int a[], int start, int end)
{
    int temp;

    while(start<end)
    {
        temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        start++;
        end--;
    }
}

void Rotate_the_array(int a[],int n, int k)
{
    if( k < 0)
    {
        cout<<"error";
    }

    if(k > n){
		k = k % n;
	}
   int index = n-k;


   reverse_array(a,0,index-1);
   reverse_array(a,index, n-1);
   reverse_array(a, 0, n-1);

}
int main()
{
 //hard coding for simplicity it could easily be for n objects.
 int rotate_array[10] = {0,1,2,3,4,5,6,7,8,9};

int k, n;
n=10;
cout<< "enter the rotation index : ";
cin>> k ;
 Rotate_the_array(rotate_array, n, k);

cout<< "the rotated array : ";
 for(int i = 0; i<n; i++ )
    cout<<rotate_array[i]<<", ";

return 0;
}

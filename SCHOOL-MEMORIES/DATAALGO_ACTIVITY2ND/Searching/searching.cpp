// HERRERA, RONDINELLI L.
#include <iostream>
using namespace std;
int main(){

    int num[] = {10, 13, 19, 26, 27, 31, 33, 35, 47, 44};
    int i, value, size = 10;

    cin >> value;
    for( i = 0; i < size; i++){
        cout << i+1 << ": value: " << num[i] << endl;
        if(num[i] == value ){
            cout << "NUMBER NOT FOUND" << endl;

        }
    }

    if(i == size ) cout << "NUMBER NOT FOUND";

    return 0;
}
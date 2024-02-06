#include <stdio.h>
#include <stdlib.h>

void accessLevel(int* rights, int minPermission) {
    int length = sizeof(rights) - sizeof(rights[0]);

    char* output = (char*) malloc(length * sizeof(char));

    for (int i = 0; i < length; i++) {
        if (rights[i] >= minPermission) {
            
        }
    }

} 

int main() {
    int rights[] = {1, 2, 3};

    accessLevel(rights, 3);
    return 0;
}
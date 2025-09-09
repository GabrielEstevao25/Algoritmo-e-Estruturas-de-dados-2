#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int somaNumeros(char entrada[]) {
    if (entrada[0] == '\0')
        return 0;
    return (entrada[0] - '0') + somaNumeros(entrada + 1);
}

int main() {
    char entrada[100];

    scanf("%s", entrada);

    while (strcmp(entrada, "FIM") != 0) {
        int soma = somaNumeros(entrada);
        printf("%d\n", soma);

        scanf("%s", entrada);
    }

    return 0;
}

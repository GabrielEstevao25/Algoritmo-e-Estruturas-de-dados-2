#include <stdlib.h>
#include <stdio.h>

int somaNumeros(char entrada[]){

    int numero =  atoi(entrada);

    int centena = numero / 100;
    int dezena = (numero % 100) / 10;
    int unidade = numero % 10;

    int soma = centena + dezena + unidade;
    return soma;
}

int main(){
    char entrada[100] ;

    scanf("%s", &entrada);

    while(strcmp(entrada, "FIM") != 0){

        int soma = somaNumeros(entrada);
        printf("%d\n", soma);

        scanf("%s", &entrada);

    }

    return 0;
}

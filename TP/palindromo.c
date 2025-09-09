#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool ehPalindromoRec(char palavra[], int i, int j) {
    if (i >= j) {
        return true;
    }
    if (palavra[i] != palavra[j]) {
        return false; 
    }
    return ehPalindromoRec(palavra, i + 1, j - 1); 
}

bool palavra(char palavra[]){
    return ehPalindromoRec(palavra, 0, strlen(palavra) - 1);
}

int main()
{
    char entrada[1000];
    int continuar = 1;  

    while (continuar == 1)
    {
        if (scanf(" %999[^\n]", entrada) != 1)
        {
            continuar = 0;
        }
        else
        {
            if (strcmp(entrada, "FIM") == 0)
            {
                continuar = 0; 
            }
            else
            {
                if (palavra(entrada))
                {
                    printf("SIM\n");
                }
                else
                {
                    printf("NAO\n");
                }
            }
        }
    }

    return 0;
}

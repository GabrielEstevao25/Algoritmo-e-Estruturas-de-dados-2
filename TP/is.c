#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

bool vogais(char palavra[]){
    int tam = strlen(palavra);
    for(int i = 0; i < tam; i++){
        char c = palavra[i];
        if (!(c == 'A'|| c == 'a'|| c == 'E'|| c == 'e'||
              c == 'I'|| c == 'i'|| c == 'O'|| c == 'o' ||
              c == 'U'|| c == 'u' || c == ' ')){
            return false;
        }
    }
    return true;
}

bool consoantes(char palavra[]) {
    int tam = strlen(palavra);
    for (int i = 0; i < tam; i++) {
        char c = palavra[i];
        if (!(
            ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) 
            &&
            !(c == 'A'|| c == 'a'|| c == 'E'|| c == 'e'||
              c == 'I'|| c == 'i'|| c == 'O'|| c == 'o'||
              c == 'U'|| c == 'u') 
        )) {
            return false;
        }
    }
    return true;
}

bool numero(char palavra[]) {
    int tam = strlen(palavra);
    if (tam == 0) return false;
    for (int i = 0; i < tam; i++) {
        char c = palavra[i];
        if (c < '0' || c > '9') return false; 
    }
    return true; 
}

bool numeroReal(char palavra[]) {
    int tam = strlen(palavra);
    int contVirgula = 0;
    for (int i = 0; i < tam; i++) {
        char c = palavra[i];
        if (c == ',' || c == '.') {
            contVirgula++;
            if (contVirgula > 1) return false;
        } else if (c < '0' || c > '9') return false; 
    }
    return true; 
}

int main(){
    char entrada[1000];

    fgets(entrada, sizeof(entrada), stdin);
    entrada[strcspn(entrada, "\n")] = '\0';

    while(strcmp(entrada, "FIM") != 0){

        if(vogais(entrada)){
            printf("SIM NAO NAO NAO\n");
        } else if(consoantes(entrada)){
            printf("NAO SIM NAO NAO\n");
        } else if(numero(entrada)){
            printf("NAO NAO SIM SIM\n");
        } else if(numeroReal(entrada)){
            printf("NAO NAO NAO SIM\n");
        } else {
            printf("NAO NAO NAO NAO\n");
        }

        fgets(entrada, sizeof(entrada), stdin);
        entrada[strcspn(entrada, "\n")] = '\0';
    }
    return 0;
}


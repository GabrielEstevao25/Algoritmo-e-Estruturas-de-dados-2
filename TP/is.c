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
              c == 'U'|| c == 'u')){
            return false;
        }
    }
    return true;
}

bool consoantes(char palavra[]){
    int tam = strlen(palavra);
    for(int i = 0; i < tam; i++){
        char c = palavra[i];
        if (c == 'A'|| c == 'a'|| c == 'E'|| c == 'e'||
            c == 'I'|| c == 'i'|| c == 'O'|| c == 'o' ||
            c == 'U'|| c == 'u'){
            return false;
        }
    }
    return true;
}

bool numero(char palavra){


}

bool numeroInteiro(char palavra){


}

int main(){
    char entrada[100];
    scanf("%s", entrada);

    bool resposta1 = vogais(entrada);
    bool resposta2 = consoantes(entrada);

    if(resposta1){
        printf("SIM\n");
    } else {
        printf("NAO\n");
    }

    if(resposta2){
        printf("SIM\n");
    } else {
        printf("NAO\n");
    }

    return 0;
}

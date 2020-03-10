#include <stdio.h>

#define MAX 50
#define FALSE 0
#define TRUE 1

#define FIM 0
#define EMPILHAR 1
#define DESEMPILHAR 2
#define LISTAR 3

int obterOpcao(void){

    int opcao;
    printf("MENU\n");
    printf("%2d - FIM\n", FIM);
    printf("%2d - EMPILHAR\n", EMPILHAR);
    printf("%2d - DESEMPILHAR\n", DESEMPILHAR);
    printf("%2d - LISTAR conteudo na pilha\n", LISTAR);
    printf("Opcao: ");
    scanf("%d", &opcao);
    putchar('\n');
    return opcao;
}

int vazia(int proxTopo){

    return proxTopo == 0;
}

int esgotada(int proxTopo){

    return proxTopo == MAX;
}

int empilhar(int valor, int *pProxTopo, int pilha[]){

    if (esgotada(*pProxTopo)) return FALSE;
    else{
        pilha[(*pProxTopo)++] = valor;
        return TRUE;
    }
}

int desempilhar(int *valor, int *pProxTopo, int pilha[]){
    if (vazia(*pProxTopo)) return FALSE;
    else{
        *valor = pilha[--(*pProxTopo)];
        return TRUE;
    }
}

int listar(int proxTopo, int pilha[]){

    if (vazia(proxTopo)) return FALSE;
    else{
        putchar('\n');
        while (proxTopo > 0){
            proxTopo--;
            printf("%03d [%6d]\n", proxTopo, pilha[proxTopo]);
        }
        return TRUE;
    }
}

int main(void){
    int opcao, pilha[MAX], proxTopo = 0, valor;
    while ((opcao = obterOpcao()) != FIM){
        switch (opcao){
        case EMPILHAR:
            printf("Valor a ser empilhado: ");
            scanf("%d", &valor);
            if (empilhar(valor, &proxTopo, pilha))
                printf("Operacao concluida com sucesso\n\n");
            else printf("Operacao frustrada - pilha esgotada...\n\n");
            break;
        case DESEMPILHAR:
            if (desempilhar(&valor, &proxTopo, pilha))
                printf("Valor %d desempilhado\n", valor);
            else printf("Operacao frustrada - pilha vazia...\n\n");
            break;
        case LISTAR:
            if (listar(proxTopo, pilha)) putchar('\n');
            else printf("Operacao frustrada - pilha vazia...\n\n");
            break;
        }
    }
    return 0;
}
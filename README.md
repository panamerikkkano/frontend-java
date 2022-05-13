# FrontEnd

## Prueba 

Entrada:

```text 
{
    int i;
    i = 0;
    while( 1 == 1 ){
        if (i < 10){
            i = i + 1;
        }
        else{
            break;
        }
    }
}
```

Salida de codigo en tres pasos :

```text
L1:	i = 0
L3:	iffalse 1 == 1 goto L2
L4:	iffalse i < 10 goto L6
L5:	i = i + 1
	goto L3
L6:	goto L2
	goto L3
L2:
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  5.421 s
Finished at: 2022-05-13T16:08:50-05:00
------------------------------------------------------------------------
```
## Entrada con error lexico:
```
{
    int i = []
}
Exception in thread "main" java.lang.Error: cerca de linea 2: error de sintaxis
```


## Entrada con error sintactico:


```text 
{
    int i;
    i = 0;
    while( do ){
        if (i < 10){
            i = i + 1;
        }
        else{
            break;
        }
    }
}
```
Error: `while (do)`

`Exception in thread "main" java.lang.Error: cerca de linea 3: error de sintaxis`

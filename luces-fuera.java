if (fila >= 0 && fila < tamaño && columna >= 0 && columna < tamaño) {
            matriz[fila][columna] = !matriz[fila][columna];
            if (fila > 0) {
                matriz[fila - 1][columna] = !matriz[fila - 1][columna];
            }
            if (fila < tamaño - 1) {
                matriz[fila + 1][columna] = !matriz[fila + 1][columna];
            }
            if (columna > 0) {
                matriz[fila][columna - 1] = !matriz[fila][columna - 1];
            }
            if (columna < tamaño - 1) {
                matriz[fila][columna + 1] = !matriz[fila][columna + 1];
            }
        } 

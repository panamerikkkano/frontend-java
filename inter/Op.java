/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package inter; // Archivo Op.java
import analizadorLexico.*; 
import simbolos.*;
public class Op extends Expr {
    public Op(Token tok, Tipo p) { super(tok, p); }
    public Expr reducir() {
        Expr x = gen();
        Temp t = new Temp(tipo);
        emitir( t.toString() + " = " + x.toString() );
        return t;
    }
}

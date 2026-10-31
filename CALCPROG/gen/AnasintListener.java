// Generated from D:/etsii/etsii 5/PL/LABORATORIO/CALCPROG/src/Anasint.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Anasint}.
 */
public interface AnasintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#orden}.
	 * @param ctx the parse tree
	 */
	void enterOrden(Anasint.OrdenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#orden}.
	 * @param ctx the parse tree
	 */
	void exitOrden(Anasint.OrdenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(Anasint.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(Anasint.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(Anasint.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#decl_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDecl_funcion(Anasint.Decl_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#decl_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDecl_funcion(Anasint.Decl_funcionContext ctx);
}
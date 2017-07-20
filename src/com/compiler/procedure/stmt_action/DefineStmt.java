package com.compiler.procedure.stmt_action;

import com.compiler.model.Stmt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefineStmt {
    public static List<String> terminator = new ArrayList<>();
    public static List<String> nonTerminals = new ArrayList<>();
    public static List<String> symbols = new ArrayList<>();
    public static Map<String,String[]> stmtList = new HashMap<>();
    public static Map<Integer,Stmt> stmts = new HashMap<>();

    static {
        terminator.add("int");terminator.add(",");terminator.add(";");terminator.add("-");
        terminator.add(":=");terminator.add("+");terminator.add("*");terminator.add("i");
        terminator.add("/");terminator.add("(");terminator.add(")");terminator.add("d");
        terminator.add("boolean");terminator.add("&&");terminator.add("||");
        terminator.add("!");terminator.add("<");terminator.add(">");
        terminator.add("<=");terminator.add(">=");terminator.add("==");
        terminator.add("{");terminator.add("}");terminator.add("if");terminator.add("else");
        terminator.add("then");

        nonTerminals.add("B");nonTerminals.add("S");nonTerminals.add("T");
        nonTerminals.add("D");nonTerminals.add("A");nonTerminals.add("E");
        nonTerminals.add("F");nonTerminals.add("L");nonTerminals.add("P");
        nonTerminals.add("P.");nonTerminals.add("P^");nonTerminals.add("G");
        nonTerminals.add("C");nonTerminals.add("Tp");

        symbols.addAll(terminator);
        symbols.addAll(nonTerminals);
        stmts.put(0,new Stmt("B","L"));
        stmts.put(2,new Stmt("S","A"));
        stmts.put(3,new Stmt("S","D"));
        stmts.put(4,new Stmt("D","D,i"));
        stmts.put(5,new Stmt("D","int`i"));
        stmts.put(6,new Stmt("E","E+T"));
        stmts.put(7,new Stmt("E","E-T"));
        stmts.put(8,new Stmt("E","T"));
        stmts.put(9,new Stmt("T","F"));
        stmts.put(10,new Stmt("T","T*F"));
        stmts.put(11,new Stmt("T","T/F"));
        stmts.put(12,new Stmt("F","i"));
        stmts.put(13,new Stmt("F","(E)"));
        stmts.put(14,new Stmt("F","d"));
        stmts.put(15,new Stmt("A","i`:=`E"));
        stmts.put(16,new Stmt("L","S;"));
        stmts.put(17,new Stmt("L","LS;"));

        stmts.put(18,new Stmt("D","boolean`i"));
        stmts.put(19,new Stmt("P^","P`&&`"));
        stmts.put(20,new Stmt("P.","P`||`"));
        stmts.put(21,new Stmt("P","P^`P"));
        stmts.put(22,new Stmt("P","P.`P"));
        stmts.put(23,new Stmt("P","!P"));
        stmts.put(24,new Stmt("P","G"));

        stmts.put(25,new Stmt("G","E<E"));
        stmts.put(26,new Stmt("G","E>E"));
        stmts.put(27,new Stmt("G","E`==`E"));
        stmts.put(28,new Stmt("G","E`>=`E"));
        stmts.put(29,new Stmt("G","E`<=`E"));
        stmts.put(30,new Stmt("A","i`:=`P"));

        stmts.put(31,new Stmt("C","if`P`then`"));
        stmts.put(32,new Stmt("S","C{L}"));
        stmts.put(33,new Stmt("Tp","C`{`L`}`else`"));
        stmts.put(34,new Stmt("S","Tp`{`L`}`"));


        stmtList.put("B",new String[]{"L"});
        stmtList.put("S",new String[]{"A","D","C{L}","Tp`{`L`}`"});
        stmtList.put("E",new String[]{"E+T","E-T","T"});
        stmtList.put("D",new String[]{"D,i","int`i","boolean`i"});
        stmtList.put("A",new String[]{"i`:=`E","i`:=`P"});
        stmtList.put("T",new String[]{"F","T*F","T/F"});
        stmtList.put("F",new String[]{"i","(E)","d"});
        stmtList.put("L",new String[]{"S;","LS;"});
        stmtList.put("P^",new String[]{"P`&&`"});
        stmtList.put("P.",new String[]{"P`||`"});
        stmtList.put("P",new String[]{"!P","G","P.`P","P^`P"});
        stmtList.put("G",new String[]{"E<E","E>E","E`==`E","E`>=`E","E`<=`E"});
        stmtList.put("C",new String[]{"if`P`then`"});
        stmtList.put("Tp",new String[]{"C`{`L`}`else`"});
    }

}

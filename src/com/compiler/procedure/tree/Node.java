package com.compiler.procedure.tree;

import java.util.ArrayList;

public class Node {
    private String name;
    private int id;
    private ArrayList<Node> children;
    private Node parent;
    private int type;
    private String val;
    private String scope;
    private int tc;
    private int fc;
    private int chain = 0;

    public Node(String name) {
        this.name = name;
    }

    public Node(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Node(String name, int id, String val) {
        this.name = name;
        this.id = id;
        this.val = val;
    }

    public Node(String name, int id, String val,int type) {
        this.name = name;
        this.id = id;
        this.val = val;
        this.type = type;
    }

    public Node() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Node{name="+name+",id="+id+",val="+val+",type="+type+",scope="+scope+"}";
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public int getFc() {
        return fc;
    }

    public void setFc(int fc) {
        this.fc = fc;
    }

    public int getChain() {
        return chain;
    }

    public void setChain(int chain) {
        this.chain = chain;
    }
}

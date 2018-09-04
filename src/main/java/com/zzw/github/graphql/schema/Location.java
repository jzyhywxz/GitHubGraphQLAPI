package com.zzw.github.graphql.schema;

/**
 * Created by zzw on 2018/8/23.
 */
public class Location {
    private int line;
    private int column;

    public int getLine() { return line; }
    public void setLine(int line) { this.line = line; }

    public int getColumn() { return column; }
    public void setColumn(int column) { this.column = column; }
}

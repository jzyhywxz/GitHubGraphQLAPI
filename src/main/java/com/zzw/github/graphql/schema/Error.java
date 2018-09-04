package com.zzw.github.graphql.schema;

/**
 * Created by zzw on 2018/8/23.
 */
public class Error {
    private String message;
    private String type;
    private String[] path;
    private Location[] locations;

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String[] getPath() { return path; }
    public void setPath(String[] path) { this.path = path; }

    public Location[] getLocations() { return locations; }
    public void setLocations(Location[] locations) { this.locations = locations; }
}

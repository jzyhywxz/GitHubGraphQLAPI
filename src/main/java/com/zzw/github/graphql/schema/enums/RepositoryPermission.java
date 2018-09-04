package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The access level to a repository")
public enum RepositoryPermission {
    @Description("Can read, clone, push, and add collaborators")
     ADMIN,
    @Description("Can read and clone")
     READ,
    @Description("Can read, clone and push")
     WRITE,
}

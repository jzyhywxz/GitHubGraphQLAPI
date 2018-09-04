package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The filters that are available when fetching check runs.")
public class CheckRunFilter {
    @Description("Filters the check runs created by this application ID.")
    private com.zzw.github.graphql.schema.scalars.Int appId;
    public com.zzw.github.graphql.schema.scalars.Int getAppId() { return this.appId; }
    public void setAppId(com.zzw.github.graphql.schema.scalars.Int appId) { this.appId = appId; }

    @Description("Filters the check runs by this name.")
    private com.zzw.github.graphql.schema.scalars.String checkName;
    public com.zzw.github.graphql.schema.scalars.String getCheckName() { return this.checkName; }
    public void setCheckName(com.zzw.github.graphql.schema.scalars.String checkName) { this.checkName = checkName; }

    @Description("Filters the check runs by this type.")
    private com.zzw.github.graphql.schema.enums.CheckRunType checkType;
    public com.zzw.github.graphql.schema.enums.CheckRunType getCheckType() { return this.checkType; }
    public void setCheckType(com.zzw.github.graphql.schema.enums.CheckRunType checkType) { this.checkType = checkType; }

    @Description("Filters the check runs by this status.")
    private com.zzw.github.graphql.schema.enums.CheckStatusState status;
    public com.zzw.github.graphql.schema.enums.CheckStatusState getStatus() { return this.status; }
    public void setStatus(com.zzw.github.graphql.schema.enums.CheckStatusState status) { this.status = status; }
}

package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The filters that are available when fetching check suites.")
public class CheckSuiteFilter {
    @Description("Filters the check suites created by this application ID.")
    private com.zzw.github.graphql.schema.scalars.Int appId;
    public com.zzw.github.graphql.schema.scalars.Int getAppId() { return this.appId; }
    public void setAppId(com.zzw.github.graphql.schema.scalars.Int appId) { this.appId = appId; }

    @Description("Filters the check suites by this name.")
    private com.zzw.github.graphql.schema.scalars.String checkName;
    public com.zzw.github.graphql.schema.scalars.String getCheckName() { return this.checkName; }
    public void setCheckName(com.zzw.github.graphql.schema.scalars.String checkName) { this.checkName = checkName; }
}

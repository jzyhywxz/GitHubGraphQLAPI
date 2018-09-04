package com.zzw.github.graphql.schema.inputobjects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("The auto-trigger preferences that are available for check suites.")
public class CheckSuiteAutoTriggerPreference {
    @NonNull("!")
    @Description("The node ID of the application that owns the check suite.")
    private com.zzw.github.graphql.schema.scalars.ID appId;
    public com.zzw.github.graphql.schema.scalars.ID getAppId() { return this.appId; }
    public void setAppId(com.zzw.github.graphql.schema.scalars.ID appId) { this.appId = appId; }

    @NonNull("!")
    @Description("Set to ")
    private com.zzw.github.graphql.schema.scalars.Boolean setting;
    public com.zzw.github.graphql.schema.scalars.Boolean getSetting() { return this.setting; }
    public void setSetting(com.zzw.github.graphql.schema.scalars.Boolean setting) { this.setting = setting; }
}

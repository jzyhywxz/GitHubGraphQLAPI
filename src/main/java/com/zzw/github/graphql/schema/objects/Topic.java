package com.zzw.github.graphql.schema.objects;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("A topic aggregates entities that are related to a subject.")
public class Topic extends com.zzw.github.graphql.schema.Metadata implements com.zzw.github.graphql.schema.interfaces.Node {
    @NonNull("!")
    private com.zzw.github.graphql.schema.scalars.ID id;
    public com.zzw.github.graphql.schema.scalars.ID getId() { return this.id; }
    public void setId(com.zzw.github.graphql.schema.scalars.ID id) { this.id = id; }

    @NonNull("!")
    @Description("The topic's name.")
    private com.zzw.github.graphql.schema.scalars.String name;
    public com.zzw.github.graphql.schema.scalars.String getName() { return this.name; }
    public void setName(com.zzw.github.graphql.schema.scalars.String name) { this.name = name; }

    @NonNull("[!]!")
    @Description("A list of related topics, including aliases of this topic, sorted with the most relevant first.")
    private com.zzw.github.graphql.schema.objects.Topic[] relatedTopics;
    public com.zzw.github.graphql.schema.objects.Topic[] getRelatedTopics() { return this.relatedTopics; }
    public void setRelatedTopics(com.zzw.github.graphql.schema.objects.Topic[] relatedTopics) { this.relatedTopics = relatedTopics; }
}

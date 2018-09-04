package com.zzw.github.graphql.schema.enums;

import com.zzw.github.graphql.schema.annotations.Argument;
import com.zzw.github.graphql.schema.annotations.Arguments;
import com.zzw.github.graphql.schema.annotations.Description;
import com.zzw.github.graphql.schema.annotations.ImplementedBy;
import com.zzw.github.graphql.schema.annotations.NonNull;

@Description("Emojis that can be attached to Issues, Pull Requests and Comments.")
public enum ReactionContent {
    @Description("Represents the 😕 emoji.")
     CONFUSED,
    @Description("Represents the ❤️ emoji.")
     HEART,
    @Description("Represents the 🎉 emoji.")
     HOORAY,
    @Description("Represents the 😄 emoji.")
     LAUGH,
    @Description("Represents the 👎 emoji.")
     THUMBS_DOWN,
    @Description("Represents the 👍 emoji.")
     THUMBS_UP,
}

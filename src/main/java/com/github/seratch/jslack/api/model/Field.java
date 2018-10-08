package com.github.seratch.jslack.api.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

/**
 * https://api.slack.com/docs/message-attachments
 */
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Field {

    /**
     * Shown as a bold heading above the value text. It cannot contain markup and will be escaped for you.
     */
    private String title;

    /**
     * The text value of the field. It may contain standard message markup (see details below) and must be escaped as normal. May be multi-line.
     * https://api.slack.com/docs/message-attachments#message_formatting
     */
    private String value;

    /**
     * An optional flag indicating whether the value is short enough to be displayed side-by-side with other values.
     */
    @SerializedName("short")
    private boolean valueShortEnough;

}
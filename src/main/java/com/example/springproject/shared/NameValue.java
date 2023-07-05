package com.example.springproject.shared;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.util.StringBuilders;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NameValue {
    private String name;
    private String value;

    @Override
    public String toString() {
        //
        StringBuilder builder = new StringBuilder();

        builder.append("NameValue{")
                .append("name='").append(name).append('\'')
                .append(", value='").append(value).append('\'')
                .append('}');

        return builder.toString();
    }
}

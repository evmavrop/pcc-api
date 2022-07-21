package gr.grnet.pccapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Getter
@Schema(name = "PrefixResponse")
public class PrefixResponseDto extends PrefixDto{
    @Schema(
            type = SchemaType.STRING,
            implementation = String.class,
            description = "The name of the linked service.",
            example = "1"
    )
    @JsonProperty("service_name")
    public String serviceName;
    @Schema(
            type = SchemaType.STRING,
            implementation = String.class,
            description = "The name of the linked domain.",
            example = "1"
    )
    @JsonProperty("domain_name")
    public String domainName;
    @Schema(
            type = SchemaType.STRING,
            implementation = String.class,
            description = "The name of the linked provider.",
            example = "1"
    )
    @JsonProperty("provider_name")
    public String providerName;
}

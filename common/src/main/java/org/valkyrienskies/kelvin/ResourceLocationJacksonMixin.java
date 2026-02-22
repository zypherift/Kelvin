package org.valkyrienskies.kelvin;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.minecraft.resources.ResourceLocation;

@JsonIncludeProperties({"namespace", "path"})
public abstract class ResourceLocationJacksonMixin {
    @JsonCreator
    public static ResourceLocation fromNamespaceAndPath(@JsonProperty("namespace") String namespace, @JsonProperty("path") String path) {
        return ResourceLocation.fromNamespaceAndPath(namespace, path);
    }
}

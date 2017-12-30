singleton Material("etki_gauges.skin_gauges.diesel")
{
    mapTo = "etki_gauges.skin_gauges.diesel";
    diffuseMap[0] = "vehicles/etki/etki_gauges_d_alt_diesel.dds";
    specularMap[0] = "vehicles/etki/etki_gauges_s.dds";
    normalMap[0] = "vehicles/etki/etki_gauges_n.dds";
    diffuseColor[0] = "1.5 1.5 1.5 1";
    specularPower[0] = "32";
    pixelSpecular[0] = "1";
    useAnisotropic[0] = "1";
    materialTag0 = "beamng"; materialTag1 = "vehicle";
    //cubemap = "global_cubemap_metalblurred";
};
singleton Material("etki_gauges_on.skin_gauges.diesel")
{
    mapTo = "etki_gauges_on.skin_gauges.diesel";
    diffuseMap[1] = "vehicles/etki/etki_gauges_d_alt_diesel.dds";
    specularMap[1] = "vehicles/etki/etki_gauges_s.dds";
    normalMap[1] = "vehicles/etki/etki_gauges_n.dds";
    diffuseMap[0] = "vehicles/etki/etki_gauges_d_alt_diesel.dds";
    specularMap[0] = "vehicles/etki/etki_gauges_s.dds";
    normalMap[0] = "vehicles/etki/etki_gauges_n.dds";
    diffuseColor[0] = "1.5 1.5 1.5 1";
    specularPower[0] = "32";
    specularPower[1] = "32";
    pixelSpecular[0] = "1";
    useAnisotropic[0] = "1";
    materialTag0 = "beamng"; materialTag1 = "vehicle";
    //cubemap = "global_cubemap_metalblurred";
    emissive[1] = "1";
    diffuseColor[1] = "1.5 0 0 1";
    useAnisotropic[1] = "1";
};

package project.kimjinbo.kimjinbo.domain.ResourceInfo;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

@Component
public class ResourceInfoRepositoryImpl implements ResourceInfoRepository {
    private List<ResourceInfo> ResourceInfos = new ArrayList<>();

    public ResourceInfoRepositoryImpl(){
        ResourceInfos.add(new ResourceInfo(1040L, "Computer01", 1, "user01"));
        ResourceInfos.add(new ResourceInfo(1041L, "Computer02", 1, "user02"));
        ResourceInfos.add(new ResourceInfo(1042L, "Computer03", 1, "user03"));
        ResourceInfos.add(new ResourceInfo(1043L, "Computer04", 1, "user04"));
        ResourceInfos.add(new ResourceInfo(1044L, "Computer05", 1, "user05"));
        ResourceInfos.add(new ResourceInfo(1045L, "mouse01", 1, "user06"));
        ResourceInfos.add(new ResourceInfo(1046L, "mouse02", 1));
        ResourceInfos.add(new ResourceInfo(1047L, "monitor01", 1));
        ResourceInfos.add(new ResourceInfo(1048L, "monitor02", 3));
        ResourceInfos.add(new ResourceInfo(2050L, "OS_01_01", 2,3));
        ResourceInfos.add(new ResourceInfo(2051L, "OS_01_03", 2,"user01"));
        ResourceInfos.add(new ResourceInfo(2052L, "OS_01_03", 2,"user02"));
        ResourceInfos.add(new ResourceInfo(2053L, "OS_01_04", 2,"user03"));
        ResourceInfos.add(new ResourceInfo(2054L, "OS_02_01", 2));
        ResourceInfos.add(new ResourceInfo(2055L, "OS_02_02", 2));
        ResourceInfos.add(new ResourceInfo(2056L, "OS_02_03", 2,"user04"));
        ResourceInfos.add(new ResourceInfo(2057L, "OS_02_04", 2,3));
        ResourceInfos.add(new ResourceInfo(2058L, "OS_02_05", 2,"user05"));
        ResourceInfos.add(new ResourceInfo(2059L, "SW_01_01", 2,"user06"));
        ResourceInfos.add(new ResourceInfo(2060L, "SW_02_01", 2,"user07"));
        ResourceInfos.add(new ResourceInfo(2061L, "SW_03_01", 2));
    }
    @Override
    public List<ResourceInfo> findAll() {
        return ResourceInfos;
    }

    @Override
    public ResourceInfo findById(Long id) {
        return ResourceInfos.stream().filter(r -> r.getId().equals(id)).findFirst().orElse(null);
    }
}

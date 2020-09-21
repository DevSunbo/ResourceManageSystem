package project.kimjinbo.kimjinbo.domain.ResourceInfo;

import java.util.List;

public interface ResourceInfoRepository {

    List<ResourceInfo> findAll();

    ResourceInfo findById(Long id);
}

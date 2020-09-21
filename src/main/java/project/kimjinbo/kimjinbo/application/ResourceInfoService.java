package project.kimjinbo.kimjinbo.application;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;



import project.kimjinbo.kimjinbo.domain.ResourceInfo.ResourceInfo;
import project.kimjinbo.kimjinbo.domain.ResourceInfo.ResourceInfoRepositoryImpl;

import java.util.List;

@Service
public class ResourceInfoService {
    @Autowired
    private ResourceInfoRepositoryImpl resourceInfoRepository;

    public List<ResourceInfo> list(){

        List<ResourceInfo> ResouceInfos = resourceInfoRepository.findAll();

        return ResouceInfos;
    }

}




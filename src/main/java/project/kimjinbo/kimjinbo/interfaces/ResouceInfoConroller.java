package project.kimjinbo.kimjinbo.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import project.kimjinbo.kimjinbo.domain.ResourceInfo.ResourceInfo;
import project.kimjinbo.kimjinbo.domain.ResourceInfo.ResourceInfoRepositoryImpl;

import java.util.List;

@RestController
public class ResouceInfoConroller {
    @Autowired
    private ResourceInfoRepositoryImpl resourceInfoRepository;

    @GetMapping("/resources")
    public List<ResourceInfo> list(){

        List<ResourceInfo> ResouceInfos = resourceInfoRepository.findAll();

        return ResouceInfos;
    }

    @GetMapping("/resource/{id}")
    public ResourceInfo detail(@PathVariable("id") Long id){
        ResourceInfo resourceInfo = resourceInfoRepository.findById(id);
        return resourceInfo;
    }
}






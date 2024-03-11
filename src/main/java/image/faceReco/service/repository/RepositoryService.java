package image.faceReco.service.repository;

import image.faceReco.domain.DTO.RepositoryIdListOwnerIdDTO;
import image.faceReco.domain.DTO.RepositoryIdListParentIdOwnerIdDTO;

import java.util.Map;

public interface RepositoryService {
    Map<String, Object> findAllRepositoryByOwnerId(int ownerId);
    int deleteRepositoryByIdList(RepositoryIdListOwnerIdDTO repositoryIdListOwnerIdDTO);
    int updateParentIdByIdList(RepositoryIdListParentIdOwnerIdDTO repositoryIdListParentIdOwnerIdDTO);
}

package image.faceReco.repository.folder;


import image.faceReco.domain.entity.Folder;
import image.faceReco.domain.updateParam.IdListParam;
import image.faceReco.domain.updateParam.IdListParentIdParam;
import image.faceReco.domain.updateParam.RepositoryNameUpdateParam;
import image.faceReco.domain.updateParam.folder.ParentFolderIdUpdateByListParam;

import java.util.List;

public interface FolderRepository {
    int createFolder(Folder folder);
    int updateFolderName(RepositoryNameUpdateParam updateParam);
    List<Folder> selectFolderByFolderId(Integer folderId);
    int deleteFolderByFolderId (Integer folderId);
    List<Folder> selectFolderByOwnerId(Integer ownerId);
    int deleteFolderByFolderIdArray(int ownerId,List<Integer> folderIdArray);
    int deleteFolderByFoldrIdList(IdListParam folderListOwnerIdParam);
    int updateFolderParentIdByFolderIdList(IdListParentIdParam idListParentIdParam);
}

package com.woniu.domain;

import java.io.Serializable;
import java.util.List;

public class Permissions implements Serializable {
    private Integer permissionId;

    private String permissionContent;

    private Integer parentId;

    private String url;
    
    private List<Permissions> Children;

    private static final long serialVersionUID = 1L;

    
    public List<Permissions> getChildren() {
		return Children;
	}

	public void setChildren(List<Permissions> children) {
		Children = children;
	}

	public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionContent() {
        return permissionContent;
    }

    public void setPermissionContent(String permissionContent) {
        this.permissionContent = permissionContent == null ? null : permissionContent.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

	@Override
	public String toString() {
		return "[ID：" + permissionId + ", 名称：" + permissionContent+"]" ;
	}

    
}
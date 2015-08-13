package com.artidemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * @author tuyenlieu
 *
 */

public class Artifact {

	private String artifactName;
	private String localPath;
	private String remotePath;

	public Artifact() {
		super();
	}

	public String getArtifactName() {
		return artifactName;
	}

	public void setArtifactName(String artifactName) {
		this.artifactName = artifactName;
	}

	public String getLocalPath() {
		return localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}

	public String getRemotePath() {
		return remotePath;
	}

	public void setRemotePath(String remotePath) {
		this.remotePath = remotePath;
	}
}

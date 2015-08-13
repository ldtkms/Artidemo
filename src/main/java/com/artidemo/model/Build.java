package com.artidemo.model;

import java.util.List;

public class Build {

	private String name;
	private String number;
	private String version;
	private String vcsUrl;

	class modules {

		private String id;
		private Artifact artifacts;
		private List<Dependency> dependencies;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Artifact getArtifacts() {
			return artifacts;
		}

		public void setArtifacts(Artifact artifacts) {
			this.artifacts = artifacts;
		}

		public List<Dependency> getDependencies() {
			return dependencies;
		}

		public void setDependencies(List<Dependency> dependencies) {
			this.dependencies = dependencies;
		}
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVcsUrl() {
		return vcsUrl;
	}

	public void setVcsUrl(String vcsUrl) {
		this.vcsUrl = vcsUrl;
	}
}

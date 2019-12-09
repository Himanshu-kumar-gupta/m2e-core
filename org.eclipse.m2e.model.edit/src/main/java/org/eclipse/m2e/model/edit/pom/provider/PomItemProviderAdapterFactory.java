/*******************************************************************************
 * Copyright (c) 2008-2010 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Sonatype, Inc. - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2e.model.edit.pom.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.m2e.model.edit.pom.util.PomAdapterFactory;


/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class PomItemProviderAdapterFactory extends PomAdapterFactory implements ComposeableAdapterFactory,
    IChangeNotifier, IDisposable {
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public PomItemProviderAdapterFactory() {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Activation} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ActivationItemProvider activationItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Activation}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createActivationAdapter() {
    if(activationItemProvider == null) {
      activationItemProvider = new ActivationItemProvider(this);
    }

    return activationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.ActivationFile} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ActivationFileItemProvider activationFileItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.ActivationFile}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createActivationFileAdapter() {
    if(activationFileItemProvider == null) {
      activationFileItemProvider = new ActivationFileItemProvider(this);
    }

    return activationFileItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.ActivationOS} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ActivationOSItemProvider activationOSItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.ActivationOS}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createActivationOSAdapter() {
    if(activationOSItemProvider == null) {
      activationOSItemProvider = new ActivationOSItemProvider(this);
    }

    return activationOSItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.ActivationProperty}
   * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ActivationPropertyItemProvider activationPropertyItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.ActivationProperty}. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createActivationPropertyAdapter() {
    if(activationPropertyItemProvider == null) {
      activationPropertyItemProvider = new ActivationPropertyItemProvider(this);
    }

    return activationPropertyItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Build} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected BuildItemProvider buildItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Build}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createBuildAdapter() {
    if(buildItemProvider == null) {
      buildItemProvider = new BuildItemProvider(this);
    }

    return buildItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.BuildBase} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected BuildBaseItemProvider buildBaseItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.BuildBase}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createBuildBaseAdapter() {
    if(buildBaseItemProvider == null) {
      buildBaseItemProvider = new BuildBaseItemProvider(this);
    }

    return buildBaseItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.CiManagement} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected CiManagementItemProvider ciManagementItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.CiManagement}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createCiManagementAdapter() {
    if(ciManagementItemProvider == null) {
      ciManagementItemProvider = new CiManagementItemProvider(this);
    }

    return ciManagementItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Contributor} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ContributorItemProvider contributorItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Contributor}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createContributorAdapter() {
    if(contributorItemProvider == null) {
      contributorItemProvider = new ContributorItemProvider(this);
    }

    return contributorItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Dependency} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected DependencyItemProvider dependencyItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Dependency}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createDependencyAdapter() {
    if(dependencyItemProvider == null) {
      dependencyItemProvider = new DependencyItemProvider(this);
    }

    return dependencyItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.DependencyManagement}
   * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected DependencyManagementItemProvider dependencyManagementItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.DependencyManagement}. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createDependencyManagementAdapter() {
    if(dependencyManagementItemProvider == null) {
      dependencyManagementItemProvider = new DependencyManagementItemProvider(this);
    }

    return dependencyManagementItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.DeploymentRepository}
   * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected DeploymentRepositoryItemProvider deploymentRepositoryItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.DeploymentRepository}. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createDeploymentRepositoryAdapter() {
    if(deploymentRepositoryItemProvider == null) {
      deploymentRepositoryItemProvider = new DeploymentRepositoryItemProvider(this);
    }

    return deploymentRepositoryItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Developer} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected DeveloperItemProvider developerItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Developer}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createDeveloperAdapter() {
    if(developerItemProvider == null) {
      developerItemProvider = new DeveloperItemProvider(this);
    }

    return developerItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.DistributionManagement}
   * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected DistributionManagementItemProvider distributionManagementItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.DistributionManagement}. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createDistributionManagementAdapter() {
    if(distributionManagementItemProvider == null) {
      distributionManagementItemProvider = new DistributionManagementItemProvider(this);
    }

    return distributionManagementItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.DocumentRoot} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected DocumentRootItemProvider documentRootItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.DocumentRoot}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createDocumentRootAdapter() {
    if(documentRootItemProvider == null) {
      documentRootItemProvider = new DocumentRootItemProvider(this);
    }

    return documentRootItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Exclusion} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ExclusionItemProvider exclusionItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Exclusion}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createExclusionAdapter() {
    if(exclusionItemProvider == null) {
      exclusionItemProvider = new ExclusionItemProvider(this);
    }

    return exclusionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Extension} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ExtensionItemProvider extensionItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Extension}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createExtensionAdapter() {
    if(extensionItemProvider == null) {
      extensionItemProvider = new ExtensionItemProvider(this);
    }

    return extensionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.IssueManagement} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected IssueManagementItemProvider issueManagementItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.IssueManagement}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createIssueManagementAdapter() {
    if(issueManagementItemProvider == null) {
      issueManagementItemProvider = new IssueManagementItemProvider(this);
    }

    return issueManagementItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.License} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected LicenseItemProvider licenseItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.License}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createLicenseAdapter() {
    if(licenseItemProvider == null) {
      licenseItemProvider = new LicenseItemProvider(this);
    }

    return licenseItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.MailingList} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected MailingListItemProvider mailingListItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.MailingList}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createMailingListAdapter() {
    if(mailingListItemProvider == null) {
      mailingListItemProvider = new MailingListItemProvider(this);
    }

    return mailingListItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Model} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ModelItemProvider modelItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Model}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createModelAdapter() {
    if(modelItemProvider == null) {
      modelItemProvider = new ModelItemProvider(this);
    }

    return modelItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Notifier} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected NotifierItemProvider notifierItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Notifier}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createNotifierAdapter() {
    if(notifierItemProvider == null) {
      notifierItemProvider = new NotifierItemProvider(this);
    }

    return notifierItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Organization} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected OrganizationItemProvider organizationItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Organization}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createOrganizationAdapter() {
    if(organizationItemProvider == null) {
      organizationItemProvider = new OrganizationItemProvider(this);
    }

    return organizationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Parent} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ParentItemProvider parentItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Parent} . <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createParentAdapter() {
    if(parentItemProvider == null) {
      parentItemProvider = new ParentItemProvider(this);
    }

    return parentItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Plugin} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected PluginItemProvider pluginItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Plugin} . <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createPluginAdapter() {
    if(pluginItemProvider == null) {
      pluginItemProvider = new PluginItemProvider(this);
    }

    return pluginItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.PluginExecution} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected PluginExecutionItemProvider pluginExecutionItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.PluginExecution}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createPluginExecutionAdapter() {
    if(pluginExecutionItemProvider == null) {
      pluginExecutionItemProvider = new PluginExecutionItemProvider(this);
    }

    return pluginExecutionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.PluginManagement} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected PluginManagementItemProvider pluginManagementItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.PluginManagement}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createPluginManagementAdapter() {
    if(pluginManagementItemProvider == null) {
      pluginManagementItemProvider = new PluginManagementItemProvider(this);
    }

    return pluginManagementItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Prerequisites} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected PrerequisitesItemProvider prerequisitesItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Prerequisites}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createPrerequisitesAdapter() {
    if(prerequisitesItemProvider == null) {
      prerequisitesItemProvider = new PrerequisitesItemProvider(this);
    }

    return prerequisitesItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Profile} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ProfileItemProvider profileItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Profile}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createProfileAdapter() {
    if(profileItemProvider == null) {
      profileItemProvider = new ProfileItemProvider(this);
    }

    return profileItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Relocation} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected RelocationItemProvider relocationItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Relocation}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createRelocationAdapter() {
    if(relocationItemProvider == null) {
      relocationItemProvider = new RelocationItemProvider(this);
    }

    return relocationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Reporting} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ReportingItemProvider reportingItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Reporting}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createReportingAdapter() {
    if(reportingItemProvider == null) {
      reportingItemProvider = new ReportingItemProvider(this);
    }

    return reportingItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.ReportPlugin} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ReportPluginItemProvider reportPluginItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.ReportPlugin}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createReportPluginAdapter() {
    if(reportPluginItemProvider == null) {
      reportPluginItemProvider = new ReportPluginItemProvider(this);
    }

    return reportPluginItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.ReportSet} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ReportSetItemProvider reportSetItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.ReportSet}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createReportSetAdapter() {
    if(reportSetItemProvider == null) {
      reportSetItemProvider = new ReportSetItemProvider(this);
    }

    return reportSetItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Repository} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected RepositoryItemProvider repositoryItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Repository}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createRepositoryAdapter() {
    if(repositoryItemProvider == null) {
      repositoryItemProvider = new RepositoryItemProvider(this);
    }

    return repositoryItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.RepositoryPolicy} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected RepositoryPolicyItemProvider repositoryPolicyItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.RepositoryPolicy}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createRepositoryPolicyAdapter() {
    if(repositoryPolicyItemProvider == null) {
      repositoryPolicyItemProvider = new RepositoryPolicyItemProvider(this);
    }

    return repositoryPolicyItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Resource} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ResourceItemProvider resourceItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Resource}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createResourceAdapter() {
    if(resourceItemProvider == null) {
      resourceItemProvider = new ResourceItemProvider(this);
    }

    return resourceItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Scm} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ScmItemProvider scmItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Scm}. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  @Override
  public Adapter createScmAdapter() {
    if(scmItemProvider == null) {
      scmItemProvider = new ScmItemProvider(this);
    }

    return scmItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Site} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected SiteItemProvider siteItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Site}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createSiteAdapter() {
    if(siteItemProvider == null) {
      siteItemProvider = new SiteItemProvider(this);
    }

    return siteItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.PropertyElement} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected PropertyElementItemProvider propertyElementItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.PropertyElement}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createPropertyElementAdapter() {
    if(propertyElementItemProvider == null) {
      propertyElementItemProvider = new PropertyElementItemProvider(this);
    }

    return propertyElementItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.m2e.model.edit.pom.Configuration} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ConfigurationItemProvider configurationItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.m2e.model.edit.pom.Configuration}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createConfigurationAdapter() {
    if(configurationItemProvider == null) {
      configurationItemProvider = new ConfigurationItemProvider(this);
    }

    return configurationItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory() {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type) {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type) {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type) {
    if(isFactoryForType(type)) {
      Object adapter = super.adapt(object, type);
      if(!(type instanceof Class) || (((Class<?>) type).isInstance(adapter))) {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public void fireNotifyChanged(Notification notification) {
    changeNotifier.fireNotifyChanged(notification);

    if(parentAdapterFactory != null) {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void dispose() {
    if(activationItemProvider != null)
      activationItemProvider.dispose();
    if(activationFileItemProvider != null)
      activationFileItemProvider.dispose();
    if(activationOSItemProvider != null)
      activationOSItemProvider.dispose();
    if(activationPropertyItemProvider != null)
      activationPropertyItemProvider.dispose();
    if(buildItemProvider != null)
      buildItemProvider.dispose();
    if(buildBaseItemProvider != null)
      buildBaseItemProvider.dispose();
    if(ciManagementItemProvider != null)
      ciManagementItemProvider.dispose();
    if(contributorItemProvider != null)
      contributorItemProvider.dispose();
    if(dependencyItemProvider != null)
      dependencyItemProvider.dispose();
    if(dependencyManagementItemProvider != null)
      dependencyManagementItemProvider.dispose();
    if(deploymentRepositoryItemProvider != null)
      deploymentRepositoryItemProvider.dispose();
    if(developerItemProvider != null)
      developerItemProvider.dispose();
    if(distributionManagementItemProvider != null)
      distributionManagementItemProvider.dispose();
    if(documentRootItemProvider != null)
      documentRootItemProvider.dispose();
    if(exclusionItemProvider != null)
      exclusionItemProvider.dispose();
    if(extensionItemProvider != null)
      extensionItemProvider.dispose();
    if(issueManagementItemProvider != null)
      issueManagementItemProvider.dispose();
    if(licenseItemProvider != null)
      licenseItemProvider.dispose();
    if(mailingListItemProvider != null)
      mailingListItemProvider.dispose();
    if(modelItemProvider != null)
      modelItemProvider.dispose();
    if(notifierItemProvider != null)
      notifierItemProvider.dispose();
    if(organizationItemProvider != null)
      organizationItemProvider.dispose();
    if(parentItemProvider != null)
      parentItemProvider.dispose();
    if(pluginItemProvider != null)
      pluginItemProvider.dispose();
    if(pluginExecutionItemProvider != null)
      pluginExecutionItemProvider.dispose();
    if(pluginManagementItemProvider != null)
      pluginManagementItemProvider.dispose();
    if(prerequisitesItemProvider != null)
      prerequisitesItemProvider.dispose();
    if(profileItemProvider != null)
      profileItemProvider.dispose();
    if(relocationItemProvider != null)
      relocationItemProvider.dispose();
    if(reportingItemProvider != null)
      reportingItemProvider.dispose();
    if(reportPluginItemProvider != null)
      reportPluginItemProvider.dispose();
    if(reportSetItemProvider != null)
      reportSetItemProvider.dispose();
    if(repositoryItemProvider != null)
      repositoryItemProvider.dispose();
    if(repositoryPolicyItemProvider != null)
      repositoryPolicyItemProvider.dispose();
    if(resourceItemProvider != null)
      resourceItemProvider.dispose();
    if(scmItemProvider != null)
      scmItemProvider.dispose();
    if(siteItemProvider != null)
      siteItemProvider.dispose();
    if(propertyElementItemProvider != null)
      propertyElementItemProvider.dispose();
    if(configurationItemProvider != null)
      configurationItemProvider.dispose();
  }

}

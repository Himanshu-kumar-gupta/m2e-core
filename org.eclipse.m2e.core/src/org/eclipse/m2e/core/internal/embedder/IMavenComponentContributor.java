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

package org.eclipse.m2e.core.internal.embedder;

/**
 * Allows extensions to contribute components to the Maven core container.
 */
public interface IMavenComponentContributor {

  void contribute(IMavenComponentBinder binder);

  public interface IMavenComponentBinder {

    <T> void bind(Class<T> role, Class<? extends T> impl, String hint);

  }

}

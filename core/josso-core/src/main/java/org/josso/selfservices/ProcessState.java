/*
 * JOSSO: Java Open Single Sign-On
 *
 * Copyright 2004-2009, Atricore, Inc.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 *
 */

package org.josso.selfservices;

/**
 * Created by IntelliJ IDEA.
 * User: sgonzalez
 * Date: Nov 28, 2008
 * Time: 2:07:23 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ProcessState {

    String getProcessId();

    String getNextStep();

    Object getAttribute(String key);

    void setAttribute(String key, Object value);

    void removeAttribute(String key);

}

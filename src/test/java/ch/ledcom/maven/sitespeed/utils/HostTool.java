/**
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */
package ch.ledcom.maven.sitespeed.utils;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Class to manipulate hosts.
 * 
 */
public final class HostTool {

    /**
     * Get the host from an url. If the url is malformed, an empty String is
     * returned.
     * 
     * @param url
     *            the url
     * @return the host
     */
    public final String getHost(String url) {
        try {
            return (new URL(url)).getHost();
        } catch (MalformedURLException e) {
            return "";
        }
    }
}

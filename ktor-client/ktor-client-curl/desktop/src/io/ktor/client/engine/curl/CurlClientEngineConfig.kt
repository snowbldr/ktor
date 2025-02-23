/*
* Copyright 2014-2021 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
*/

package io.ktor.client.engine.curl

import io.ktor.client.engine.*

/**
 * A configuration for the [Curl] client engine.
 */
public class CurlClientEngineConfig : HttpClientEngineConfig() {
    /**
     * Forces proxy tunneling by setting `CURLOPT_HTTPPROXYTUNNEL`.
     */
    internal var forceProxyTunneling: Boolean = false

    /**
     * Enables TLS host and certificate verification by setting the
     * `CURLOPT_SSL_VERIFYPEER` and `CURLOPT_SSL_VERIFYHOST` options.
     * Similar to `-k/--insecure` curl option.
     *
     * Setting this property to `false` is recommended only for testing purposes.
     */
    public var sslVerify: Boolean = true
}

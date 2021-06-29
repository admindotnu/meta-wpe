SUMMARY = "WPE Framework OpenCDMi - Widevine Nexus SVP"
DESCRIPTION = "WPE Framework OpenCDMi module for Widevine Nexus SVP"
HOMEPAGE = "https://code.rdkcentral.com/r/plugins/gitiles/soc/broadcom/components/rdkcentral/OCDM-Widevine-Nexus-SVP"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=feac6454ca1bb4ff09e7bc76d34f57ed"

require include/wpeframework-plugins.inc

DEPENDS_append = " broadcom-refsw"

PV = "3.0+gitr${SRCPV}"
SRC_URI = "git://code.rdkcentral.com/r/soc/broadcom/components/rdkcentral/OCDM-Widevine-Nexus-SVP.git;protocol=https;branch=master"
SRCREV = "fa60a8b37af4da396a8ba108dc4f9f85b6eaf10e"

FILES_${PN} = "${datadir}/WPEFramework/OCDM/*.drm"


require include/wpeframework-ocdm-playready.inc

PV = "3.0+gitr${SRCPV}"
SRC_URI = "\
    git://git@github.com/rdkcentral/OCDM-Playready.git;protocol=https;branch=PR2.5 \
    file://0001-OCDM-Playready-adjust-header-order-to-fix-build-issue.patch \
"
SRCREV = "9c530ee979d67aeb07c710f6c51026ae37807936"
